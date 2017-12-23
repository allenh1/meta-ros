# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides ROS interfaces to the Neuronics Katana 450 arm.     It wra"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "actionlib armadillo catkin-native control-msgs geometry-msgs katana-msgs kni moveit-msgs roscpp roslib sensor-msgs std-srvs tf trajectory-msgs urdf"
SRC_URI = "https://github.com/uos-gbp/${PN}_driver-release/archive/release/kinetic/${PN}/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "765c6980b30997b6929480a89432e07b"
SRC_URI[sha256sum] = "040323dee998fc110e0dd8f4016a267e8a12dfd829c7db09d280d258581fcb14"
S = "${WORKDIR}/${PN}_driver-release-release-kinetic-${PN}-1.1.2-0"

inherit catkin
