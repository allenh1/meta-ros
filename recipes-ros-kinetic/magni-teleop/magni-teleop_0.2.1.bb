# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The magni_teleop package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native joy teleop-twist-joy"
SRC_URI = "https://github.com/UbiquityRobotics-release/magni_robot-release/archive/release/kinetic/magni_teleop/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1f73c4b766ebd39594ce6db443dd9af5"
SRC_URI[sha256sum] = "7baf5adf9830431c4755609121f2481c9143642bc1fe1ca10a480f12c8947807"
S = "${WORKDIR}/magni_robot-release-release-kinetic-magni_teleop-0.2.1-0"

inherit catkin
