# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package is composed of 'dynamixel_tool', 'dynamixel_driver' and 'dynamixel_"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native dynamixel-sdk roscpp roslib"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/dynamixel-workbench-release/archive/release/kinetic/dynamixel_workbench_toolbox/0.1.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5f8db60ced3d13a5738f7a617c3d1a07"
SRC_URI[sha256sum] = "ca8754e7697bffc090f676b47ac31703e0fae6c5f712424156d91031df9bffd2"
S = "${WORKDIR}/dynamixel-workbench-release-release-kinetic-dynamixel_workbench_toolbox-0.1.9-0"

inherit catkin
