# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Playstation 3 SIXAXIS or DUAL SHOCK 3 joystick driver.     Driver for the Sony P"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bluez catkin-native diagnostic-msgs joystick libusb-dev python-bluez rosgraph rospy sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/joystick_drivers-release/archive/release/kinetic/${PN}/1.11.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "46a3124c0b403f62d7b366cb267559ef"
SRC_URI[sha256sum] = "6fe75d1eef68ff402a84464e9fc95a6d877fac92409f325547b95cfde5fd6255"
S = "${WORKDIR}/joystick_drivers-release-release-kinetic-${PN}-1.11.0-0"

inherit catkin
