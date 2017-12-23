# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains nodes that control the Dynamixel by communicating with the"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native dynamixel-workbench-msgs roscpp"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/dynamixel-workbench-release/archive/release/kinetic/dynamixel_workbench_operators/0.1.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c99f1181071590484188b28b901ea97c"
SRC_URI[sha256sum] = "139f4617c05cc6eb54a2ea3cae96f59f171c8c57cd33d97ec56d357f49f0458c"
S = "${WORKDIR}/dynamixel-workbench-release-release-kinetic-dynamixel_workbench_operators-0.1.9-0"

inherit catkin
