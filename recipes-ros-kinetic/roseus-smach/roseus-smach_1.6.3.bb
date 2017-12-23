# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roseus_smach       * Euslisp state machine class. it will be moved.      * Messa"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-tutorials catkin-native euslisp message-generation message-runtime roseus rostest smach smach-msgs smach-ros std-msgs"
SRC_URI = "https://github.com/tork-a/jsk_roseus-release/archive/release/kinetic/roseus_smach/1.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "911f1e9850b94a4279f5f67d59c04379"
SRC_URI[sha256sum] = "ed4024191390423c6001d6abe2f1c50911089a4cdb1dfaddde4479f5eddf48b5"
S = "${WORKDIR}/jsk_roseus-release-release-kinetic-roseus_smach-1.6.3-0"

inherit catkin
