# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This rqt plugin succeeds former dynamic_reconfigure's GUI 		(reconfigure_gui), a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=84c495f29572cac328d96461b2320089"

DEPENDS = "catkin dynamic-reconfigure python-qt-binding rospy rqt-console rqt-gui rqt-gui-py rqt-py-common"
SRC_URI = "https://github.com/ros-gbp/rqt_reconfigure-release/archive/release/lunar/rqt_reconfigure/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "65b58690b8b902cab5d30f5cb745929f"
SRC_URI[sha256sum] = "bd24427d7da185c22fc4b23b779027e5e798bb3a0c195f2ac38fed89bb2f5eb2"
S = "${WORKDIR}/rqt_reconfigure-release-release-lunar-rqt_reconfigure-0.4.8-0"

inherit catkin
