# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cob_head_axis"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "actionlib catkin-native cob-canopen-motor cob-generic-can cob-srvs cob-utilities control-msgs diagnostic-msgs roscpp rospy sensor-msgs std-srvs urdf"
SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/kinetic/cob_head_axis/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d0ca6f10e7c2d1a4ee28fd2bed96bb6e"
SRC_URI[sha256sum] = "0de4e7a868c34d0a34da1d41324c386a321aa3eef8f47bd404bfa2c04e7597b9"
S = "${WORKDIR}/cob_driver-release-release-kinetic-cob_head_axis-0.6.10-0"

inherit catkin
