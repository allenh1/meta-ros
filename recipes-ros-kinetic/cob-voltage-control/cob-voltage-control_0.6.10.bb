# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interface to IO board that manages emergency stop and battery voltage on rob@wor"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-msgs cob-phidgets dynamic-reconfigure python-tk roscpp rospy std-msgs"
SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/kinetic/cob_voltage_control/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c2e6f49049b4208d9ce879d5f6a09155"
SRC_URI[sha256sum] = "615c061bfc3a8790073f847b6cdcc11d14133d46b62747d6b1a1a24be9018538"
S = "${WORKDIR}/cob_driver-release-release-kinetic-cob_voltage_control-0.6.10-0"

inherit catkin
