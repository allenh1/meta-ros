# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package depends on a recent version of the Kinematics and Dynamics     Libr"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native orocos-kdl python-orocos-kdl"
SRC_URI = "https://github.com/smits/orocos-kdl-release/archive/release/kinetic/orocos_kinematics_dynamics/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a6241083167677441dec67dfcc45381e"
SRC_URI[sha256sum] = "8eda2fe53e407e3d565f187b91fb37508c99efd14143d25fb73ffb1d61437e43"
S = "${WORKDIR}/orocos-kdl-release-release-kinetic-orocos_kinematics_dynamics-1.3.1-0"

inherit catkin
