# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The robotis_controller_msgs package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-Framework-msgs-release/archive/release/kinetic/robotis_controller_msgs/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9e08858f7feb24ff4136ce6ad7adafe8"
SRC_URI[sha256sum] = "569aa7c1343f2754fac54599a351b7889d6c91fa605c0b0668df20a0a651e53a"
S = "${WORKDIR}/ROBOTIS-Framework-msgs-release-release-kinetic-robotis_controller_msgs-0.1.1-0"

inherit catkin
