# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A set of message filters which take in messages and may output those messages at"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native rosconsole roscpp rostest rosunit xmlrpcpp"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/kinetic/message_filters/1.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "24d5307f6e511acc4df76de1a6fe176a"
SRC_URI[sha256sum] = "e67170a0aeae76a7ded485095d5c2dcf46d90181c3c26265f176b28bc5469ca1"
S = "${WORKDIR}/ros_comm-release-release-kinetic-message_filters-1.12.12-0"

inherit catkin
