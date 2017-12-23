# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An rqt plugin that provides a graphical, interactive testsuite for Kobuki."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs kobuki-testsuite nav-msgs pyqt5-dev-tools qt-gui-py-common rospy rqt-gui rqt-gui-py rqt-plot rqt-py-common"
SRC_URI = "https://github.com/yujinrobot-release/kobuki_desktop-release/archive/release/kinetic/kobuki_qtestsuite/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1494b8581adcc152a32c7d04dfdbac8d"
SRC_URI[sha256sum] = "efb81e6b4380549a16cbd71921d1f8054544365fdc5fc65582f69530e096bc94"
S = "${WORKDIR}/kobuki_desktop-release-release-kinetic-kobuki_qtestsuite-0.5.7-0"

inherit catkin
