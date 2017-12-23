# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides tele-operation nodes to control the Neuronics Katana 450 a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "actionlib catkin-native control-msgs katana-msgs roscpp sensor-msgs"
SRC_URI = "https://github.com/uos-gbp/katana_driver-release/archive/release/kinetic/katana_teleop/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2c8da35c6d167932c7e936443b8ba2e2"
SRC_URI[sha256sum] = "ba6a7c0cc003c5929474b50c163471adf1778ff42770de6043e70c4e7b209326"
S = "${WORKDIR}/katana_driver-release-release-kinetic-katana_teleop-1.1.2-0"

inherit catkin
