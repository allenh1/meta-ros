# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains examples of applying the 'dynamixel_workbench_toolbox' lib"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native dynamixel-sdk dynamixel-workbench-msgs dynamixel-workbench-toolbox roscpp std-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/dynamixel-workbench-release/archive/release/kinetic/dynamixel_workbench_controllers/0.1.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f9765927ebbab218bd9445359233aaf3"
SRC_URI[sha256sum] = "20aec78c5fc4f6b9391dde52f8f65d913dc55b56ec75c7b10ca8c1419551ad74"
S = "${WORKDIR}/dynamixel-workbench-release-release-kinetic-dynamixel_workbench_controllers-0.1.9-0"

inherit catkin
