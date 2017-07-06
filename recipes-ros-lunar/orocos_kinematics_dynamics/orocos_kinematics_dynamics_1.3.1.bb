# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=11;endline=11;md5=d2740cd2c4139b24d7392872077c634a"

DEPENDS = "catkin orocos_kdl python_orocos_kdl"
SRC_URI = "https://github.com/smits/orocos-kdl-release/archive/release/lunar/orocos_kinematics_dynamics/1.3.1-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "010022a040b7dd12e004f49b1fe8031d"
SRC_URI[sha256sum] = "f81a1a179b95e0fedccb5a554b1dd9ee818126c0b31f8a98ec4199562c9c85c3"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
