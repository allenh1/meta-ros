# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This rqt plugin succeeds former dynamic_reconfigure's GUI 		(reconfigure_gui), a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=75730354549103aaba72b66caf53717b"

DEPENDS = "catkin-native dynamic-reconfigure python-qt-binding rospy rqt-console rqt-gui rqt-gui-py rqt-py-common"
SRC_URI = "https://github.com/ros-gbp/rqt_reconfigure-release/archive/release/kinetic/rqt_reconfigure/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2b4babb1f8c3e85623ec0f5512da36bf"
SRC_URI[sha256sum] = "7d793c4c5436bdf04f28e8f2de1b01e57affd70def4550fc3340549fc9631eba"
S = "${WORKDIR}/rqt_reconfigure-release-release-kinetic-rqt_reconfigure-0.4.8-0"

inherit catkin
