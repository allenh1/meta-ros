# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A set of message filters which take in messages and may output those messages at"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native rosconsole roscpp rostest rosunit xmlrpcpp"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/message_filters/1.13.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d390d4d14d8a9e53f9dc943cb08d0a29"
SRC_URI[sha256sum] = "4f3a7e4cbfddf17d4a2cb15448ac9081a4fff6a9dd39f3d3f161bc3ecbf930ed"
S = "${WORKDIR}/ros_comm-release-release-lunar-message_filters-1.13.5-0"

inherit catkin
