# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides service calls for getting ros meta-information, like list of     topics"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime rosbridge-library rosgraph rosnode rospy"
SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/kinetic/${PN}/0.8.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c0c74df6a3d21fe3ca51f56d6e3551fe"
SRC_URI[sha256sum] = "f2f0fc8332ae8b0be5bfba814fe1577532be53558fda7965829ad20ec8e41787"
S = "${WORKDIR}/rosbridge_suite-release-release-kinetic-${PN}-0.8.6-0"

inherit catkin
