# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The OctoMap library implements a 3D occupancy grid mapping approach, providing d"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=509de1ed17993b1d2b4ee44d8e586f68"

DEPENDS = "catkin cmake"
SRC_URI = "https://github.com/ros-gbp/octomap-release/archive/release/lunar/octomap/1.9.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f40b7ee457e773a8051513f85d508bad"
SRC_URI[sha256sum] = "2fdae278182294c1e6dea2b2e885ef098b6653938f0546a56dd648cfcf5e251c"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
