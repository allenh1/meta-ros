# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The mqtt_bridge package"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin-native catkin rosbridge-library rospy std-msgs"
SRC_URI = "https://github.com/groove-x/mqtt_bridge-release/archive/release/lunar/mqtt_bridge/0.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7cf38e1f9e8621c4eabd4d89af78cd1f"
SRC_URI[sha256sum] = "8a1a43b83d887d1294573bc0fc1ed1ecfb16ced8b6f04ed3efadb241de123388"
S = "${WORKDIR}/mqtt_bridge-release-release-lunar-mqtt_bridge-0.1.6-0"

inherit catkin
