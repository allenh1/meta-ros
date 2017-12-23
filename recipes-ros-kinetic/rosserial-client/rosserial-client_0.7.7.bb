# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generalized client side source for rosserial."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rosbash rospy rosserial-msgs std-msgs tf"
SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/kinetic/rosserial_client/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5a63e702652fe3541f828b9f33245b91"
SRC_URI[sha256sum] = "723cf26954e6b01cda5036a7145362a401d19021e5e58ccec9ee5ca50f96ef4f"
S = "${WORKDIR}/rosserial-release-release-kinetic-rosserial_client-0.7.7-0"

inherit catkin
