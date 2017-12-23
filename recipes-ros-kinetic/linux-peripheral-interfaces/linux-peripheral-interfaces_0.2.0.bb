# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Simple scripts which help utilise, monitor, interact with computer      hardware"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native laptop-battery-monitor libsensors-monitor"
SRC_URI = "https://github.com/ros-gbp/linux_peripheral_interfaces-release/archive/release/kinetic/linux_peripheral_interfaces/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b7f0b03bb32eab83ad1879a57702aff5"
SRC_URI[sha256sum] = "12fea2c1a817a1d9498d81655f98536b8d96515c7909cbcbae5851432d3a68e3"
S = "${WORKDIR}/linux_peripheral_interfaces-release-release-kinetic-linux_peripheral_interfaces-0.2.0-0"

inherit catkin
