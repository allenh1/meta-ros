# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the description (mechanical, kinematic, visual,   etc.) of"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native gazebo-ros rospy rosunit xacro"
SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/kinetic/cob_description/0.6.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "89457ff337d16631d158ac9d998b232c"
SRC_URI[sha256sum] = "ae5b67483615683ad09f667bf7cfe32c33168210994143e6d002246267bb7d56"
S = "${WORKDIR}/cob_common-release-release-kinetic-cob_description-0.6.7-0"

inherit catkin
