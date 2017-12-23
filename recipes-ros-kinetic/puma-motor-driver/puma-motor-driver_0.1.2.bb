# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ROS driver for Puma single-channel motor control board."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "can-utils catkin-native diagnostic-updater joy puma-motor-msgs roscpp sensor-msgs serial"
SRC_URI = "https://github.com/clearpath-gbp/puma_motor_driver-release/archive/release/kinetic/puma_motor_driver/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "92ebe9faf0e714ad6cd1bd6ea66f6f29"
SRC_URI[sha256sum] = "75567ed22850d2cb397c2873c85fa10fc30c41e80ef40d7e463005ded8a65968"
S = "${WORKDIR}/puma_motor_driver-release-release-kinetic-puma_motor_driver-0.1.2-0"

inherit catkin
