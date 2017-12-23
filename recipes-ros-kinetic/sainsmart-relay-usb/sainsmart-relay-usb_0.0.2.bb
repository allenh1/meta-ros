# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "SainSmart USB relay driver controller"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native libftdi-dev roscpp roslib std-msgs"
SRC_URI = "https://github.com/DataspeedInc-release/sainsmart_relay_usb-release/archive/release/kinetic/sainsmart_relay_usb/0.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7e3115230677fcdfad294a4a412c6784"
SRC_URI[sha256sum] = "a7c45ddb079d74a3c0fb1f29cb325395b37c8d2806cd2fef178ae946e52d5420"
S = "${WORKDIR}/sainsmart_relay_usb-release-release-kinetic-sainsmart_relay_usb-0.0.2-0"

inherit catkin
