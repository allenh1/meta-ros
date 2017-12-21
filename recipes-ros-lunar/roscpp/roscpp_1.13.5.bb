# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roscpp is a C++ implementation of ROS. It provides     a  that enables C++ progr"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cpp-common message-generation message-runtime pkgconfig rosconsole roscpp-serialization roscpp-traits rosgraph-msgs roslang rostime std-msgs xmlrpcpp"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/${PN}/1.13.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "950b95560bbb2735fc88e436e502578f"
SRC_URI[sha256sum] = "b28d6a1a1eef8e6fa4c7800f6e2623c39704b9097d036aba94992fbdbc7a414f"
S = "${WORKDIR}/ros_comm-release-release-lunar-${PN}-1.13.5-0"

inherit catkin
