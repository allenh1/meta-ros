# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The mqtt_bridge package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin-native rosbridge-library rospy std-msgs"
SRC_URI = "https://github.com/groove-x/mqtt_bridge-release/archive/release/kinetic/mqtt_bridge/0.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b91fddaa246cd8d32103a3c7e51943c6"
SRC_URI[sha256sum] = "46a3a798c11f7784b46d7d6c3e950603c31b0ad4ed501ed42104e433f2cfd19c"
S = "${WORKDIR}/mqtt_bridge-release-release-kinetic-mqtt_bridge-0.1.6-0"

inherit catkin
