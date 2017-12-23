# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS Node that convert IMU data to a Twist for manual robot drive."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native dynamic-reconfigure geometry-msgs rospy sensor-msgs"
SRC_URI = "https://github.com/easymov/${PN}-release/archive/release/kinetic/${PN}/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1c31bd07a4e51b53191191f729f44cb7"
SRC_URI[sha256sum] = "fb44eeb670d3a4f34cb98abeb57833217a69197cc3691a90825713a0e9171995"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.0.0-0"

inherit catkin
