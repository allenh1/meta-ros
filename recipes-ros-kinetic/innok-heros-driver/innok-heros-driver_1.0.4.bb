# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver for the Innok Heros robot plattform"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native geometry-msgs rospy std-msgs tf"
SRC_URI = "https://github.com/innokrobotics/innok_heros_driver-release/archive/release/kinetic/innok_heros_driver/1.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "720fb779fb3cdfe9fc8e91b441917c4a"
SRC_URI[sha256sum] = "a4ad8975345794f5376ef3c794e45298278deb030a1cb039b361132dcdfc3da7"
S = "${WORKDIR}/innok_heros_driver-release-release-kinetic-innok_heros_driver-1.0.4-0"

inherit catkin
