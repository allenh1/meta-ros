# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cob_monitoring"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "actionlib catkin-native cob-light cob-msgs cob-script-server diagnostic-msgs diagnostic-updater ipmitool python-mechanize python-psutil roscpp rospy rostopic sensor-msgs std-msgs sysstat topic-tools"
SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/kinetic/cob_monitoring/0.6.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ba8bf7233465546487da32192c7f606d"
SRC_URI[sha256sum] = "1793622c844ce737e8acfe5f81c4ec69f161ce0eaa686aca30e206a9585f6647"
S = "${WORKDIR}/cob_command_tools-release-release-kinetic-cob_monitoring-0.6.6-0"

inherit catkin
