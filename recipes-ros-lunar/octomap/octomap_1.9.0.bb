# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The OctoMap library implements a 3D occupancy grid mapping approach, providing d"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/1.9.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f40b7ee457e773a8051513f85d508bad"
SRC_URI[sha256sum] = "2fdae278182294c1e6dea2b2e885ef098b6653938f0546a56dd648cfcf5e251c"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-1.9.0-0"

inherit catkin
