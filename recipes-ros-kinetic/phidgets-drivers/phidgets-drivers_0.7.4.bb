# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "API and ROS drivers for Phidgets devices"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=9b8b2c2c843b0cb5803c38944da723d5"

DEPENDS = "catkin-native libphidget21 phidgets-api phidgets-high-speed-encoder phidgets-imu"
SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/kinetic/phidgets_drivers/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7238431bfc65bf11ac080568d5a25b77"
SRC_URI[sha256sum] = "e9c9f350cd25292a730e030cefacd9785777ac302c3df7b9d23db0ce4cc79146"
S = "${WORKDIR}/phidgets_drivers-release-release-kinetic-phidgets_drivers-0.7.4-0"

inherit catkin
