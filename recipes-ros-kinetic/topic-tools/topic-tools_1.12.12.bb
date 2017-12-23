# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tools for directing, throttling, selecting, and otherwise messing with     ROS t"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cpp-common message-generation message-runtime rosconsole roscpp rostest rostime rosunit std-msgs xmlrpcpp"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/kinetic/topic_tools/1.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0e55e8118633939489744fbad9a54c41"
SRC_URI[sha256sum] = "e6a3f4c084f27b61a1892ceeebbb19b29504f72dab23bee7449e4dd29e508d3d"
S = "${WORKDIR}/ros_comm-release-release-kinetic-topic_tools-1.12.12-0"

inherit catkin
