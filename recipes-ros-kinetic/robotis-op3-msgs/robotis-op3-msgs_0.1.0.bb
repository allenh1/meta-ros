# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS msgs packages for the ROBOTIS OP3 (meta package)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native op3-action-module-msgs op3-offset-tuner-msgs op3-walking-module-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-OP3-msgs-release/archive/release/kinetic/robotis_op3_msgs/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "38049cc23d5a87b4d1563b29d1b68a29"
SRC_URI[sha256sum] = "85a7619777fc132a8c19b3c4da6b2c4fec8e39d34d607d8c842093bb4c4feeb8"
S = "${WORKDIR}/ROBOTIS-OP3-msgs-release-release-kinetic-robotis_op3_msgs-0.1.0-0"

inherit catkin
