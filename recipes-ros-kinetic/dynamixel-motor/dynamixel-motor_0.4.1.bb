# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This stack contains packages that are used to interface with Robotis     Dynamix"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamixel-controllers dynamixel-driver dynamixel-msgs dynamixel-tutorials"
SRC_URI = "https://github.com/arebgun/dynamixel_motor-release/archive/release/kinetic/dynamixel_motor/0.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0ffc3052d6141fe1bc291423793ba20e"
SRC_URI[sha256sum] = "6b3d9e1c1cbe77d56e54061870e7321525d9684941c18c30b837d93f2ebcec68"
S = "${WORKDIR}/dynamixel_motor-release-release-kinetic-dynamixel_motor-0.4.1-0"

inherit catkin
