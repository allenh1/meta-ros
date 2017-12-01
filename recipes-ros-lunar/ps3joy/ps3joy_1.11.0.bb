# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Playstation 3 SIXAXIS or DUAL SHOCK 3 joystick driver.     Driver for the Sony P"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bluez catkin-native diagnostic-msgs joystick libusb-dev python-bluez rosgraph rospy sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/joystick_drivers-release/archive/release/lunar/${PN}/1.11.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "04192c2f0af8d7975c65830f48b554b4"
SRC_URI[sha256sum] = "6b4c935fcfa12652b6ebd1ef9b1161b17183df04d2af00e5b23c19665b49d010"
S = "${WORKDIR}/joystick_drivers-release-release-lunar-${PN}-1.11.0-0"

inherit catkin
