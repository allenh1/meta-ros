# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "It provides a grapic user interface to check the status of Dynamixel and control"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native dynamixel-workbench-msgs dynamixel-workbench-toolbox libqt4-dev qt-build roscpp"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/dynamixel-workbench-release/archive/release/kinetic/dynamixel_workbench_single_manager_gui/0.1.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dd3e06e8fcb5196036ebe9c5f4783bf7"
SRC_URI[sha256sum] = "d858f1ff9d0f0537ada920b7f972d6b007b343c2abc81189191d063c603ed653"
S = "${WORKDIR}/dynamixel-workbench-release-release-kinetic-dynamixel_workbench_single_manager_gui-0.1.9-0"

inherit catkin
