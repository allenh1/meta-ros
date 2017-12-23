# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A more performance- and stability-oriented server alternative implemented     in"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp rosserial-msgs rosserial-python std-msgs topic-tools"
SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/kinetic/rosserial_server/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "66ab99449f43a121c7e2e6bf5d52f467"
SRC_URI[sha256sum] = "c0ffe69d61a2a6685a8cd858454400c55306e8388ee07ff66491f69629594188"
S = "${WORKDIR}/rosserial-release-release-kinetic-rosserial_server-0.7.7-0"

inherit catkin
