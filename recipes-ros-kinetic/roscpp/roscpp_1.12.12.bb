# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roscpp is a C++ implementation of ROS. It provides     a  that enables C++ progr"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cpp-common message-generation message-runtime pkgconfig rosconsole roscpp-serialization roscpp-traits rosgraph-msgs roslang rostime std-msgs xmlrpcpp"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/kinetic/${PN}/1.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8330eb858f47789e979adbdf9ec96a96"
SRC_URI[sha256sum] = "b59e5f86761ac4b85c8305f0904a6be5c83b7d9afc27c507c724cd0b6e6d4811"
S = "${WORKDIR}/ros_comm-release-release-kinetic-${PN}-1.12.12-0"

inherit catkin
