# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides simulated tactile sensors for the Schunk Dextrous      Han"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=48;endline=48;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native gazebo-msgs rospy schunk-sdh"
SRC_URI = "https://github.com/ipa320/schunk_modular_robotics-release/archive/release/kinetic/schunk_simulated_tactile_sensors/0.6.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "023ce089e9d302d8f18ef947988b4f07"
SRC_URI[sha256sum] = "8b812b33da2eb841f3d19765a4a0399fefcbf17adea46654094f672d235a8b4e"
S = "${WORKDIR}/schunk_modular_robotics-release-release-kinetic-schunk_simulated_tactile_sensors-0.6.9-0"

inherit catkin
