# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver for the Phidgets high speed encoder devices"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native libphidget21 message-generation message-runtime phidgets-api roscpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/kinetic/phidgets_high_speed_encoder/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6981d00ca282695e0a16d731dea25842"
SRC_URI[sha256sum] = "6b17d45a478fa3ce039be6f2c1dfad6b656b0d7e730351dc15ef407beb2beb4f"
S = "${WORKDIR}/phidgets_drivers-release-release-kinetic-phidgets_high_speed_encoder-0.7.4-0"

inherit catkin
