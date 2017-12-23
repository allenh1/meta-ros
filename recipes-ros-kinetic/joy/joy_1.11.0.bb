# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS driver for a generic Linux joystick.     The joy package contains joy_node, "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-updater joystick roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/${PN}stick_drivers-release/archive/release/kinetic/${PN}/1.11.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3392ecfe687ccb80118b083e2b2c3400"
SRC_URI[sha256sum] = "0fdcf65cb70846df59ff56abd0f214ad25df9153140dae86eadb72208000b95e"
S = "${WORKDIR}/${PN}stick_drivers-release-release-kinetic-${PN}-1.11.0-0"

inherit catkin
