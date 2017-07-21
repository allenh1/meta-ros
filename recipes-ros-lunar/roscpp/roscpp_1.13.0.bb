# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roscpp is a C++ implementation of ROS. It provides     a  that enables C++ progr"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin cpp-common message-generation message-runtime pkgconfig rosconsole roscpp-serialization roscpp-traits rosgraph-msgs roslang rostime std-msgs xmlrpcpp"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/roscpp/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3d78495c3e11d7bdabf476ce637218fc"
SRC_URI[sha256sum] = "8a5512f7b31070fc710e279969cee9c0eadde67354ec7fcf6703ed147cb0b04f"
S = "${WORKDIR}/ros_comm-release-release-lunar-roscpp-1.13.0-0"

inherit catkin
