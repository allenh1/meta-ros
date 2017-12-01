# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains a set of tools that can be used from a hard     realtime thread, withou"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp rospy"
SRC_URI = "https://github.com/ros-gbp/realtime_tools-release/archive/release/lunar/realtime_tools/1.11.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4baef268561a65067392ccb5063dbaa6"
SRC_URI[sha256sum] = "006d73ce849843ddac35c6fa4f317ffe87214a0c74055863abd39c9a04719e2d"
S = "${WORKDIR}/realtime_tools-release-release-lunar-realtime_tools-1.11.0-0"

inherit catkin
