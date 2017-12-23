# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The criutils package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=f5654d47d02d927c4f7a04f0a51abaa1"

DEPENDS = "catkin-native geometry-msgs python-numpy python-termcolor rosbash rospy rostopic sensor-msgs std-msgs tf visualization-msgs"
SRC_URI = "https://github.com/crigroup/${PN}-release/archive/release/kinetic/${PN}/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "794ecd7fc470f2797e5c4f9096ec2ca3"
SRC_URI[sha256sum] = "7007ff9204fe4d2e94b17bc60002ca156615524c37125fbf516079365e986397"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.1.1-0"

inherit catkin
