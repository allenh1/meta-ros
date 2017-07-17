# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Server Side tools for Authorization and Authentication of ROS Clients"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin libssl-dev message_generation message_runtime roscpp rostest"
SRC_URI = "https://github.com/gt-rail-release/rosauth-release/archive/release/lunar/rosauth/0.1.7-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "624415206c00cd8c143544ec58a2c300"
SRC_URI[sha256sum] = "0c2006073c736b085a2e083c9ce1112c36b7f9dc07a684c3fa6beba028d09422"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
