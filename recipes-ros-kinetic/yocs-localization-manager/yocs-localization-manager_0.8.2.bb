# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Localization Manager helps to localize robot's position with annotated informati"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib ar-track-alvar ar-track-alvar-msgs catkin-native dynamic-reconfigure geometry-msgs roslint rospy std-msgs tf yocs-msgs"
SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/kinetic/yocs_localization_manager/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b5fce61e3d45576d1ef019e6c47b0ee6"
SRC_URI[sha256sum] = "c262b6ec1437a06ceac24673d35bf2633f4639e92591d57049bc205b404bb31a"
S = "${WORKDIR}/yujin_ocs-release-release-kinetic-yocs_localization_manager-0.8.2-0"

inherit catkin
