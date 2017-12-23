# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Virtual sensor that uses semantic map information to "see" obstacles undetectabl"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs roscpp rospy rospy-message-converter sensor-msgs tf visualization-msgs yocs-math-toolkit yocs-msgs"
SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/kinetic/yocs_virtual_sensor/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6f45c7399a34cb2970d7649d2efe9f24"
SRC_URI[sha256sum] = "988276fb89f50d0236f4008d3db198704f56c0788f6065f7c7077cd12442e896"
S = "${WORKDIR}/yujin_ocs-release-release-kinetic-yocs_virtual_sensor-0.8.2-0"

inherit catkin
