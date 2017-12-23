# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roscpp_traits contains the message traits code as described in     .      This p"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cpp-common rostime"
SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/kinetic/roscpp_traits/0.6.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "98c8f5c80900614b69900f3d8c3a8522"
SRC_URI[sha256sum] = "27fbae829e420d24bc865128bc7da7c579de315179b633bc49badb3a19446aa0"
S = "${WORKDIR}/roscpp_core-release-release-kinetic-roscpp_traits-0.6.7-0"

inherit catkin
