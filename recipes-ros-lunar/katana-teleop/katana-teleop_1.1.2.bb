# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides tele-operation nodes to control the Neuronics Katana 450 a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "actionlib catkin-native control-msgs katana-msgs roscpp sensor-msgs"
SRC_URI = "https://github.com/uos-gbp/katana_driver-release/archive/release/lunar/katana_teleop/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e9c62823101494aa5cc85b41ecd71f96"
SRC_URI[sha256sum] = "a33d1929cacbb5d7f94d2f3b9c832dfae7edcc209a5cb0081ffea95c0e494357"
S = "${WORKDIR}/katana_driver-release-release-lunar-katana_teleop-1.1.2-0"

inherit catkin
