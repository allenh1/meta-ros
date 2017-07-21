# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A Python GUI plugin for introspecting available ROS message types.   Note that t"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin python-rospkg python-qt-binding roslib rosmsg rospy rqt-console rqt-gui rqt-gui-py rqt-py-common"
SRC_URI = "https://github.com/ros-gbp/rqt_msg-release/archive/release/lunar/rqt_msg/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "01c87ab556041b1ade7217be026fd619"
SRC_URI[sha256sum] = "22672ad0b94edc8b799d842b28b07000fb9cdd4e6d77939c851afd6f8e50c4c5"
S = "${WORKDIR}/rqt_msg-release-release-lunar-rqt_msg-0.4.8-0"

inherit catkin
