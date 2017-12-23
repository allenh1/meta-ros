# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages for representing state information, such as battery information and eme"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native diagnostic-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/kinetic/cob_msgs/0.6.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c299ec79ba138004a727e586113f59da"
SRC_URI[sha256sum] = "77cae790f54c042359984746fc24781d0c9fa57a765a5237dc7df54d28e903d5"
S = "${WORKDIR}/cob_common-release-release-kinetic-cob_msgs-0.6.7-0"

inherit catkin
