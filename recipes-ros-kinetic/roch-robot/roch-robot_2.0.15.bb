# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapackage for SawYer roch robot software"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roch-base roch-capabilities roch-control roch-description roch-ftdi roch-msgs roch-safety-controller roch-sensorpc"
SRC_URI = "https://github.com/SawYerRobotics-release/roch_robot-release/archive/release/kinetic/roch_robot/2.0.15-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1a0adc3921af2a7e07ec72d9ec674104"
SRC_URI[sha256sum] = "2cb5dcd0974cc1df0aa7a3541ea2759cb1711123a5e0c8f45910ea1664e0d49b"
S = "${WORKDIR}/roch_robot-release-release-kinetic-roch_robot-2.0.15-0"

inherit catkin
