# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cob_model_identifier package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "boost catkin-native cmake-modules geometry-msgs kdl-parser orocos-kdl roscpp roslint rospy sensor-msgs std-srvs tf"
SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/kinetic/cob_model_identifier/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f75ad55123651270f3b1380bff578be1"
SRC_URI[sha256sum] = "8a897bfe5b70ab0dc7e2cdb34df1fcec8e572c905101d3ffffcffdb959553c57"
S = "${WORKDIR}/cob_control-release-release-kinetic-cob_model_identifier-0.7.0-0"

inherit catkin
